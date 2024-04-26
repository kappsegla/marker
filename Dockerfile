FROM maven:3.9.6-eclipse-temurin-22-alpine as build
WORKDIR /app
COPY . /app
RUN mvn compile \
    && jlink --module-path "%JAVA_HOME%/jmods:target/" \
    --add-modules org.fungover.marker \
    --output /customjre \
    --launcher launch=org.fungover.marker/org.fungover.marker.Marker

FROM alpine:latest
COPY --from=build /customjre /customjre
ENTRYPOINT ["/customjre/bin/launch"]
