MAILHOG_PORT_SMTP=55061
MAILHOG_PORT_HTTP=55062
MAILHOG_CONTAINER_NAME=Reference-MailHog
PROJECT_NAME=reference_mailhog

all:
	@echo init
	@echo up
	@echo down
	@echo info

info:
	@echo '$(MAILHOG_CONTAINER_NAME)'
	@echo 'Frontend: http://localhost:$(MAILHOG_PORT_HTTP)'

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'MAILHOG_PORT_SMTP=$(MAILHOG_PORT_SMTP)' >> .env
	@echo 'MAILHOG_PORT_HTTP=$(MAILHOG_PORT_HTTP)' >> .env
	@echo 'MAILHOG_CONTAINER_NAME=$(MAILHOG_CONTAINER_NAME)' >> .env

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
