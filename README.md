The goal of the kata is to replace the variables into the parsed string.

For example: 

function name("Hello `$user`, today is `$day`", user=Carlos, day=monday)  
return "Hello Carlos, today is monday"
    
We have to consider the to introduce the variables into the  
and assume that we can replace many variables.
