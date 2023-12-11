FLOG_LOG_FORMAT=apache_common
FLOG_LOG_PATH=$(PWD)/log/flog/
FLOG_CONTAINER_NAME=Reference-Flog
PROJECT_NAME=reference_flog

all:
	@echo init
	@echo up
	@echo down
	@echo info

info:
	@echo 'Flog'
	@echo 'Log: /output/$(FLOG_LOG_FORMAT).log'

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'FLOG_LOG_FORMAT=$(FLOG_LOG_FORMAT)' >> .env
	@echo 'FLOG_LOG_PATH=$(FLOG_LOG_PATH)' >> .env
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
