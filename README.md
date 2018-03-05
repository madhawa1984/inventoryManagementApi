# inventoryManagementApi

# create the following sql statements before run the application
# need to create the user and gran permission on the data base;
CREATE DATABASE IF NOT EXISTS openinventorymgt;
GRANT ALL PRIVILEGES ON openinventorymgt.* TO openinventoryuser@localhost IDENTIFIED BY 'openinvuser123';
FLUSH PRIVILEGES;
mysql -u openinventoryuser -p openinvuser123 openinvenroty;



How to run this application on IDE:-
pass followiing argumets as program arguments of the DailyworktrackerApplication class
--spring.profiles.active=dev


# TODO add Excepption controller to capture the exception
# enable google sigining
        - manage session along with google signing
# enable facebook signing
        - manage session with facebook signing

# listen to the facebook google events and logout the application - based on the event revoke the
  JWT tokens before the token expiration

# enable authenticate route with the JWT token.


