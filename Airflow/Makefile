# default credential
# user name: airflow
# password: airflow

UID = $(shell id -u)
DEFAULT_REDIS_PORT = 55045
DEFAULT_WEBSERVER_PORT = 55046
DEFAULT_FLOWER_PORT = 55047
PROJECT_NAME = reference_airflow

all:
	@echo init
	@echo up
	@echo down

init: init-dir init-env init-container

init-dir:
	mkdir -p ./dags ./logs ./plugins ./config

init-env:
	rm -f .env
	touch .env
	echo AIRFLOW_UID=$(UID) >> .env
	echo REDIS_PORT=$(DEFAULT_REDIS_PORT) >> .env
	echo WEBSERVER_PORT=$(DEFAULT_WEBSERVER_PORT) >> .env
	echo FLOWER_PORT=$(DEFAULT_FLOWER_PORT) >> .env

init-container:
	docker compose \
	--env-file .env \
	--project-name $(PROJECT_NAME) \
	up airflow-init

up:
	docker compose \
	--env-file .env \
	--project-name $(PROJECT_NAME) \
	up -d

down:
	docker compose \
	--env-file .env \
	--project-name $(PROJECT_NAME) \
	down
