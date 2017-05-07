FROM docker.wso2.com/wso2is-as-keymanager:5.3.0

COPY deployment/is-key-manager/carbon/ /mnt/wso2-artifacts
RUN rm /mnt/wso2is-5.3.0/repository/components/dropins/org.wso2.carbon.identity.application.authenticator.facebook-5.1.3.jar
COPY artifacts/mysql-connector-java-5.1.34-bin.jar /mnt/wso2-artifacts/repository/components/lib/
