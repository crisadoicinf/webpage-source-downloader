FROM eclipse-temurin:17-jdk

# Install Google Chrome
RUN apt-get update
RUN apt-get install -y wget
RUN apt-get install -y gnupg2
RUN wget -q -O - https://dl.google.com/linux/linux_signing_key.pub | apt-key add -
RUN echo "deb http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list
RUN apt-get update
RUN apt-get -y install google-chrome-stable

#copy project files
COPY pom.xml target/libs/* /opt/libs/
COPY target/*.jar /opt/app.jar
RUN echo 'alias wpsd="java -jar /opt/app.jar"' >> ~/.bashrc
