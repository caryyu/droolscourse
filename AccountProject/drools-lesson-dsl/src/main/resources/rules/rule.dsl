[when]There is a person with name of "{name}"=Person(name=="{name}")
[when]Person is at least {age} years old and lives in "{location}"=
      Person(age >= {age}, location=="{location}")
[when]There is a person with=Person()
[when]- name is "{name}"=name=="{name}"
[when]- age is less than {age}=age<{age}
[when]- location at "{location}"=location=="{location}"
[then]Log "{message}"=System.out.println("{message}");