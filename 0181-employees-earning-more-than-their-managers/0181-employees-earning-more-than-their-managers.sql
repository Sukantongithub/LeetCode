SELECT E.name AS Employee FROM Employee E JOIN Employee M ON E.managerId = m.id Where E.salary>M.salary;
