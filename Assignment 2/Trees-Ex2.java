class Solution {

  public String printLevelByLevel(Employee ceo) {
     Queue<Employee> q = new LinkedList<>();
     q.add(ceo);

     while (q.size() != 0) {
       Employee curr_employee = q.poll();
       System.out.printf("Name: %s, Title: %s\n", curr_employee.name, curr_employee.title);
       if (!curr_employee.directReports.isEmpty()) {
         for (int k = 0; k < curr_employee.directReports.size(); k++) {
           q.add(curr_employee.directReports.get(k));
         }
       }
     }
  }
}
