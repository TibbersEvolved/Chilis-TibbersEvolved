const fetchButton = document.querySelector("#fetchButton");
const fetchForm = document.querySelector("#fetchPart");
const path = "http://localhost:8080";

fetchButton.onClick = () => {
  alert("hi");
};

fetchButton.addEventListener("click", function (e) {
  alert("no problemo");
  fetch(path + "/fetch")
  .then((response) => response.json())
  .then((data) => alert({data}));
})
alert("this is amazing");