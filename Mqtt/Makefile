MQTT_PORT_DEFAULT=55056
MQTT_PORT_WEBSOCKET=55057
MQTT_CONTAINER_NAME=Reference-Mqtt
PROJECT_NAME=reference_mqtt

all:
	@echo init
	@echo up
	@echo down
	@echo ps

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'MQTT_PORT_DEFAULT=$(MQTT_PORT_DEFAULT)' >> .env
	@echo 'MQTT_PORT_WEBSOCKET=$(MQTT_PORT_WEBSOCKET)' >> .env
	@echo 'MQTT_CONTAINER_NAME=$(MQTT_CONTAINER_NAME)' >> .env

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

ps:
	docker ps -f "name=$(MQTT_CONTAINER_NAME)"
