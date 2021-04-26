##### Dashboard is not accessible (error 404)
Steps to reproduce problem:
* run `./gradlew publishToMavenLocal` on jobrunr master branch to publish v1.0.0-SNAPSHOT to local repo
* run example app with `./gradlew run`
* wait for `JobRunr Dashboard started at http://localhost:8000` log entry and try open this url
