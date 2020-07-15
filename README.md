<pre><code>
# Docker
docker run -d --restart always --hostname my-rabbit --name some-rabbit -p 4369:4369 -p 5671:5671 -p 5672:5672 -p 15672:15672 rabbitmq
docker exec some-rabbit rabbitmq-plugins enable rabbitmq_management

# Login at http://localhost:15672/ (or the IP of your docker host)
# using guest/guest

while true; do curl --location --request POST 'http://localhost:8080/publish' --header 'Content-Type: application/json' --data '{"id":123,"name":"zzzzzzzzzzzzzzzzzz"}';sleep 1; done

</pre></code>
