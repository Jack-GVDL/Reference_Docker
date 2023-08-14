INFLUXDB_PORT=55054
INFLUXDB_CONTAINER_NAME=Reference-Influxdb
INFLUXDB_IMAGE_VERSION=influxdb:2.7
INFLUXDB_USER=admin
INFLUXDB_PASSWORD=$(shell openssl rand -hex 20)
INFLUXDB_ADMIN_TOKEN=$(shell openssl rand -hex 20)
PROJECT_NAME=reference_influxdb

all:
	@echo init
	@echo up
	@echo down

init: init-config init-env

init-config:
	docker run \
	--rm ${INFLUXDB_IMAGE_VERSION} \
	influxd print-config > ./config/config.yml

init-env:
	@rm -rf .env
	@touch .env
	@echo 'INFLUXDB_PORT=$(INFLUXDB_PORT)' >> .env
	@echo 'INFLUXDB_CONTAINER_NAME=$(INFLUXDB_CONTAINER_NAME)' >> .env
	@echo 'INFLUXDB_IMAGE_VERSION=$(INFLUXDB_IMAGE_VERSION)' >> .env
	@echo 'INFLUXDB_USER=$(INFLUXDB_USER)' >> .env
	@echo 'INFLUXDB_PASSWORD=$(INFLUXDB_PASSWORD)' >> .env
	@echo 'INFLUXDB_ADMIN_TOKEN=$(INFLUXDB_ADMIN_TOKEN)' >> .env

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
