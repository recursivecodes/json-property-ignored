To test, because I'm lazy, run the app and make two cURL calls:

```bash
curl -i -X POST -H "Content-Type: application/x-www-form-urlencoded" -d 'first_name=todd' http://localhost:8080/test/bad 
```

```bash
curl -i -X POST -H "Content-Type: application/x-www-form-urlencoded" -d 'first_name=todd' http://localhost:8080/test/good
```

Observe that the first call throws an exception, the second call works as expected.

