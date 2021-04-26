#!/bin/sh
if $1
	then
	/mnt/Datos/Desarrollo/payara5/glassfish/bin/asadmin start-domain
else
	/mnt/Datos/Desarrollo/payara5/glassfish/bin/asadmin stop-domain
fi

