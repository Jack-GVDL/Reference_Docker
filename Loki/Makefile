LOKI_PORT=55040
LOKI_LOG_PATH=$(PWD)/log/
LOKI_CONFIG_PATH=$(PWD)/config/
LOKI_DATA_PATH=$(PWD)/data/
LOKI_LOKI_CONTAINER_NAME=Reference-Loki-Loki
LOKI_PROMTAIL_CONTAINER_NAME=Reference-Loki-Promtail
PROJECT_NAME=reference_loki

all:
	@echo init
	@echo up
	@echo down
	@echo info

info:
	@echo 'Loki'
	@echo 'Frontend: http://localhost:$(LOKI_PORT)'

init: init-dir init-env

init-dir:
	@mkdir -p data/data

init-env:
	@rm -f .env
	@touch .env
	@echo 'LOKI_PORT=$(LOKI_PORT)' >> .env
	@echo 'LOKI_LOG_PATH=$(LOKI_LOG_PATH)' >> .env
	@echo 'LOKI_CONFIG_PATH=$(LOKI_CONFIG_PATH)' >> .env
	@echo 'LOKI_DATA_PATH=$(LOKI_DATA_PATH)' >> .env
	@echo 'LOKI_LOKI_CONTAINER_NAME=$(LOKI_LOKI_CONTAINER_NAME)' >> .env
	@echo 'LOKI_PROMTAIL_CONTAINER_NAME=$(LOKI_PROMTAIL_CONTAINER_NAME)' >> .env

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
