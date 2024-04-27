FROM openjdk:17-jdk-slim

ENV TOMCAT_DIR=/usr/local/tomcat
# ENV TOMCAT_FILE=apache-tomcat-8.5.100.tar.gz
ENV TOMCAT_FILE=apache-tomcat-10.1.23.tar.gz
ENV WAR_FILE=tomcat-demo-0.0.1-SNAPSHOT.war

COPY ${TOMCAT_FILE} /opt

RUN apt-get update;\
    mkdir ${TOMCAT_DIR}; \
    tar -xzf /opt/${TOMCAT_FILE} -C ${TOMCAT_DIR} --strip-components 1;

COPY ${WAR_FILE} ${TOMCAT_DIR}/webapps 

CMD [ "/usr/local/tomcat/bin/catalina.sh", "run" ]