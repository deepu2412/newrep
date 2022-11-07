
function getJson() {

    let jsonDiv = document.getElementById('jsonDiv');

    fetch("http://192.168.0.248:8090/getAll", {
        headers: new Headers({
          "Content-Type": "application/json",
          "Accept": "application/json"
        })
      })
        .then((response) => response.json())
        .then((responseData) => {
          console.log(responseData);
          jsonDiv.innerText = JSON.stringify(responseData); 
        })
        .catch((error) => {
          console.log(error);
        });
}

function getXml() {
    
    let xmlDiv = document.getElementById('xmlDiv');

    fetch("http://192.168.0.248:8090/getAll", {
        headers: new Headers({
          "Content-Type": "application/xml",
          "Accept": "application/xml"
        })
      })
        .then(response => response.text())
        .then(str => new window.DOMParser().parseFromString(str, "text/xml"))
        .then(data => console.log(data))
        .catch((error) => {
          console.log(error);
        });
}