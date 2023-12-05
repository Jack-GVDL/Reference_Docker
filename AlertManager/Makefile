ALERT_MANAGER_PORT=55060
ALERT_MANAGER_CONTAINER_NAME=Reference-AlertManager
PROJECT_NAME=reference_alert-manager

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'ALERT_MANAGER_PORT=$(ALERT_MANAGER_PORT)' >> .env
	@echo 'ALERT_MANAGER_CONTAINER_NAME=$(ALERT_MANAGER_CONTAINER_NAME)' >> .env

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

# - https://gist.github.com/cherti/61ec48deaaab7d288c9fcf17e700853a
test:
	curl -XPOST http://localhost:$(ALERT_MANAGER_PORT)/api/v1/alerts -d "[{ \
		\"status\": \"firing\", \
		\"labels\": { \
			\"alertname\": \"test\", \
			\"service\": \"my-service\", \
			\"severity\":\"warning\", \
			\"instance\": \"test\" \
		}, \
		\"annotations\": { \
			\"summary\": \"High latency is high!\" \
		} \
	}]"
