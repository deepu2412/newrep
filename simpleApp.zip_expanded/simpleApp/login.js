let employeeId = "";
let employeePassword = "";

function login() {
    employeeId = document.getElementById("empId").value;
    employeePassword = document.getElementById("empPassword").value;

  fetch("http://192.168.0.248:8090/login", {
    method: "POST",
    headers: new Headers({
      "Content-Type": "application/json",
      "Accept": "application/json"
    }),
    body: JSON.stringify({
        "empId": employeeId,
        "empPassword": employeePassword,
    }),
  })
    .then((response) => response.json())
    .then((responseData) => {
      console.log(responseData);
      window.location.replace('./home.html');
    })
    .catch((error) => {
      console.log(error);
    });
}
