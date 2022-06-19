select p.firstname,p.lastname,a.city,a.state 
from person p 
LEFT JOIN Address a 
ON p.personId=a.personId;
