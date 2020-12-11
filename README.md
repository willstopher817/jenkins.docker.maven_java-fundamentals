### Install And Use Docker
1. [Install
Docker](https://curriculeon.github.io/Curriculeon/lectures/containerization/docker/installation/content.html)
	* Installation of the following services:
	* virtualbox
	* docker-cli
	* docker-machine
	* docker-desktop

2. [Containerize a Jar](https://curriculeon.github.io/Curriculeon/lectures/containerization/docker/installation/content.html)
3. [SSH Into Docker ContainerInstall And Configure Jenkins](https://curriculeon.github.io/Curriculeon/lectures/containerization/docker/ssh-into-container/content.html)


### Install And Configure Jenkins
[Install Jenkins](https://curriculeon.github.io/Curriculeon/lectures/ci-cd/jenkins/installation/content.html)
4. [Create Jenkins Command Line Registry](https://curriculeon.github.io/Curriculeon/lectures/ci-cd/jenkins/create-commandline-registry/content.html)
5. [Disable Jenkins Security Use](https://curriculeon.github.io/Curriculeon/lectures/ci-cd/jenkins/disabling-security-use/content.html)
6. [Install Jenkins Plugin - Convert To Pipeline](https://curriculeon.github.io/Curriculeon/lectures/ci-cd/jenkins/install-plugin-convert-to-pipeline/content.html)
7. [Install Jenkins Plugin - Docker](https://curriculeon.github.io/Curriculeon/lectures/ci-cd/jenkins/install-plugin-docker-dependencies/content.html)
8. [Install Jenkins Plugin - Shining Panda](https://curriculeon.github.io/Curriculeon/lectures/ci-cd/jenkins/install-plugin-shiningpanda/content.html)
9. [Install Jenkins Plugin - Shining Panda](https://curriculeon.github.io/Curriculeon/lectures/ci-cd/jenkins/docker-integration/content.html)
10. [Jenkins Environment Configuration - Docker Integration](https://curriculeon.github.io/Curriculeon/lectures/ci-cd/jenkins/docker-integration/content.html)

### Final Objective
11. [My First Maven Pipeline](https://curriculeon.github.io/Curriculeon/lectures/ci-cd/jenkins/docker-integration/content.html)
- Create a Jenkins pipeline which
	1. `.jar`s [a Maven Application](https://curriculeon.github.io/Curriculeon/lectures/ci-cd/jenkins/docker-integration/content.html)
	2. containerizes `.jar` in a Docker Instance
	3. runs junit tests and ignore failures on `.jar` in Docker Instance by leveraging command below
		* `-Dmaven.test.failure.ignore=true`
	4. ensure output of build is displayed by Jenkins
