

const form = document.getElementById('myForm');
const input = document.getElementById('romanInput');

form.addEventListener('submit', (event) => {
  const inputValue = input.value;
  if (/\d/.test(inputValue)) {
    event.preventDefault();
    alert('Input cannot contain numbers!');
  }
});



//const form = document.getElementById("myForm");
    form.addEventListener("submit", (event) => {
      event.preventDefault();
      const data = {
        roman: document.getElementById("romanInput").value
      };
      fetch("http://localhost:8080/roman", {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
      })
      .then(response => response.json())
      .then(data => {
        console.log("Success:", data);
        // handle success response here
      })
      .catch((error) => {
        console.error("Error:", error);
        // handle error response here
      });
    });


    fetch('http://localhost:8080/roman/int')
        .then(response => response.json())
        .then(data => {
          const romanValues = document.getElementById('roman-values');
          data.forEach(item => {
            const row = document.createElement('tr');
            const id = document.createElement('td');
            id.innerText = item.id;
            const roman = document.createElement('td');
            roman.innerText = item.roman;
            const conversion = document.createElement('td');
            conversion.innerText = item.conversion;
            row.appendChild(id);
            row.appendChild(roman);
            row.appendChild(conversion);
            romanValues.appendChild(row);
          });
        })
        .catch(error => console.error(error));


