let employeeId = "";
let employeePassword = "";
let employeeEmail = '';
let empName = '';

function login() {
    employeeName = document.getElementById("empName").value;
    employeeEmail = document.getElementById("empEmail").value;
    employeeId = document.getElementById("empId").value;
    employeePassword = document.getElementById("empPassword").value;
    let alert = document.getElementById('alert');

  fetch("http://192.168.0.248:8090/register", {
    method: "POST",
    headers: new Headers({
      "Content-Type": "application/json",
      "Accept": "application/json"
    }),
    body: JSON.stringify({
        "empId": employeeId,
        "empPassword": employeePassword,
        "empName": employeeName,
        "emailId": employeeEmail
    }),
  })
    .then((response) => response.json())
    .then((responseData) => {
      console.log(responseData);
      alert.style.visibility = 'visible';
    })
    .catch((error) => {
      console.log(error);
    });
}
