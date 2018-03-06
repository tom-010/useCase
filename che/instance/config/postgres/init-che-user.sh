#!/bin/bash

echo "Initial call to run-postgresql..."
run-postgresql --version
export PGDATA=/var/lib/pgsql/data/userdata
pg_ctl -w start -o "-h ''"
echo "Initializing Che user..."

psql -v ON_ERROR_STOP=1 --username "postgres" <<-EOSQL
    ALTER USER $POSTGRESQL_USER WITH SUPERUSER;
EOSQL

psql -v ON_ERROR_STOP=1 --username "$POSTGRESQL_USER" <<-EOSQL
    CREATE USER $CHE_POSTGRES_USERNAME WITH PASSWORD '$CHE_POSTGRES_PASSWORD';
    CREATE DATABASE $CHE_POSTGRES_DATABASE;
    GRANT ALL PRIVILEGES ON DATABASE $CHE_POSTGRES_DATABASE TO $CHE_POSTGRES_USERNAME;
    ALTER USER $CHE_POSTGRES_USERNAME WITH SUPERUSER;
EOSQL
if [[ $? -ne 0 ]]
then
  echo "Warning: Failed initializing the Che user and database"
fi

psql -v ON_ERROR_STOP=1 --username "postgres" <<-EOSQL
    ALTER USER $POSTGRESQL_USER WITH NOSUPERUSER;
EOSQL

pg_ctl -w stop

unset CHE_POSTGRES_DATABASE
unset CHE_POSTGRES_USERNAME
unset CHE_POSTGRES_PASSWORD

exit 0
