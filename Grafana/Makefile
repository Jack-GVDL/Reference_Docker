# credential
# userName: admin
# password: admin

GRAFANA_PORT = 55039
PROJECT_NAME = reference_grafana

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	rm -f .env
	touch .env
	echo GRAFANA_PORT=$(GRAFANA_PORT) >> .env

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
