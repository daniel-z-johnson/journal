# journal
something or other to come later explaining something


## Starting application
### Database
#### Local
postgres running on port 5433 with database called `journal` user `journal` and password `postgress` this for local only, if prod ever it will be different
#### docker local
`cd` into the `postgres-docker-compose` folder and run `docker-compose up` must have `docker` and `docker-compose` installed
### application
Have maven installed and on path and run in root application directory `mvn clean spring-boot:run`
