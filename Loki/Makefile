LOKI_PORT = 55040
PROJECT_NAME = reference_loki

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
