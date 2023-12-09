# TEMPLATE: ALL_UPPER_CASE
# Template: UpperCamalCase
# template: lowerCamalCase

TEMPLATE_PORT=0
TEMPLATE_CONTAINER_NAME=Reference-Template
PROJECT_NAME=reference_template

all:
	@echo init
	@echo up
	@echo down
	@echo info

info:
	@echo '$(TEMPLATE_CONTAINER_NAME)'

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'TEMPLATE_PORT=$(TEMPLATE_PORT)' >> .env
	@echo 'TEMPLATE_CONTAINER_NAME=$(TEMPLATE_CONTAINER_NAME)' >> .env

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
