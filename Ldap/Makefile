LDAP_PORT_SERVER_HTTP=55065
LDAP_PORT_SERVER_TLS=55066
LDAP_PORT_ADMIN=55067
LDAP_SERVER_CONTAINER_NAME=Reference-Ldap-Server
LDAP_ADMIN_CONTAINER_NAME=Reference-Ldap-Admin
PROJECT_NAME=reference_ldap

all:
	@echo init
	@echo up
	@echo down
	@echo info

# admin DN: cn=admin,dc=example,dc=org
# admin password: admin
info:
	@echo 'LDAP_SERVER_CONTAINER_NAME: $(LDAP_SERVER_CONTAINER_NAME)'
	@echo 'LDAP_ADMIN_CONTAINER_NAME: $(LDAP_ADMIN_CONTAINER_NAME)'
	@echo 'Frontend: https://localhost:$(LDAP_PORT_ADMIN)'

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'LDAP_PORT_SERVER_HTTP=$(LDAP_PORT_SERVER_HTTP)' >> .env
	@echo 'LDAP_PORT_SERVER_TLS=$(LDAP_PORT_SERVER_TLS)' >> .env
	@echo 'LDAP_PORT_ADMIN=$(LDAP_PORT_ADMIN)' >> .env
	@echo 'LDAP_SERVER_CONTAINER_NAME=$(LDAP_SERVER_CONTAINER_NAME)' >> .env
	@echo 'LDAP_ADMIN_CONTAINER_NAME=$(LDAP_ADMIN_CONTAINER_NAME)' >> .env

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
