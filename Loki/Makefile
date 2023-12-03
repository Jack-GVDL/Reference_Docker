LOKI_PORT=55040
LOKI_CONTAINER_NAME=Reference-Loki
LOKI_PROMTAIL_CONTAINER_NAME=Reference-Loki-Promtail
LOKI_FLOG_CONTAINER_NAME=Reference-Loki-Flog
PROJECT_NAME=reference_loki

all:
	@echo init
	@echo up
	@echo down

init: init-dir init-env

init-dir:
	@mkdir -p data/data

init-env:
	@rm -f .env
	@touch .env
	@echo 'LOKI_PORT=$(LOKI_PORT)' >> .env
	@echo 'LOKI_CONTAINER_NAME=$(LOKI_CONTAINER_NAME)' >> .env
	@echo 'LOKI_PROMTAIL_CONTAINER_NAME=$(LOKI_PROMTAIL_CONTAINER_NAME)' >> .env
	@echo 'LOKI_FLOG_CONTAINER_NAME=$(LOKI_FLOG_CONTAINER_NAME)' >> .env

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
