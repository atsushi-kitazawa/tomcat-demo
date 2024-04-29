FROM openjdk:17-jdk-slim

ENV TOMCAT_DIR=/usr/local/tomcat
ENV TOMCAT_FILE=apache-tomcat-10.1.23.tar.gz
ENV WAR_FILE=tomcat-demo-0.0.1-SNAPSHOT.war

COPY ./tomcat/${TOMCAT_FILE} /opt

RUN apt-get update;\
    mkdir ${TOMCAT_DIR}; \
    tar -xzf /opt/${TOMCAT_FILE} -C ${TOMCAT_DIR} --strip-components 1;

COPY ./tomcat/${WAR_FILE} ${TOMCAT_DIR}/webapps 

COPY ./tomcat/setenv.sh ${TOMCAT_DIR}/bin
RUN chmod 755 ${TOMCAT_DIR}/bin/setenv.sh

CMD [ "/usr/local/tomcat/bin/catalina.sh", "run" ]