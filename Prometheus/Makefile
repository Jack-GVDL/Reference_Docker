PROMETHEUS_PORT=55050
PROMETHEUS_CONTAINER_NAME=Reference-Prometheus
PROJECT_NAME=reference_prometheus

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'PROMETHEUS_PORT=$(PROMETHEUS_PORT)' >> .env
	@echo 'PROMETHEUS_CONTAINER_NAME=$(PROMETHEUS_CONTAINER_NAME)' >> .env

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
