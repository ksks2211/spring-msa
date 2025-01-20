#!/bin/sh

# 지연 시간 설정
echo "Starting Spring Boot App..."


# 애플리케이션 실행
exec java -Duser.timezone=UTC -jar -Dspring.profiles.active="${SPRING_PROFILES_ACTIVE}" app.jar