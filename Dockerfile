FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/clojure-ci-app.jar /clojure-ci-app/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/clojure-ci-app/app.jar"]
