# credential
# userName: admin
# password: admin

GRAFANA_DATA_PATH=$(PWD)/data/grafana/
GRAFANA_PORT=55039
GRAFANA_CONTAINER_NAME=Reference-Grafana
PROJECT_NAME=reference_grafana

all:
	@echo init
	@echo up
	@echo down
	@echo info

info:
	@echo 'Grafana'
	@echo 'Frontend: http://localhost:$(GRAFANA_PORT)'

init: init-env
	@echo 'Initiated'

init-env:
	@rm -f .env
	@touch .env
	@echo GRAFANA_DATA_PATH=$(GRAFANA_DATA_PATH) >> .env
	@echo GRAFANA_PORT=$(GRAFANA_PORT) >> .env
	@echo GRAFANA_CONTAINER_NAME=$(GRAFANA_CONTAINER_NAME) >> .env

up:
	docker-compose \
	--env-file .env \
	--project-name $(PROJECT_NAME) \
	up -d

down:
	docker-compose \
	--env-file .env \
	--project-name $(PROJECT_NAME) \
	down
