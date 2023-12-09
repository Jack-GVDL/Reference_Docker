FLOG_LOG_FORMAT=apache_error
FLOG_CONTAINER_NAME=Reference-Flog
PROJECT_NAME=reference_flog

all:
	@echo init
	@echo up
	@echo down
	@echo info

info:
	@echo '$(FLOG_CONTAINER_NAME)'

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'FLOG_LOG_FORMAT=$(FLOG_LOG_FORMAT)' >> .env
	@echo 'FLOG_CONTAINER_NAME=$(FLOG_CONTAINER_NAME)' >> .env

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
