

const form = document.getElementById('myForm');
const input = document.getElementById('romanInput');

//checks if the value inserted is not a string
form.addEventListener('submit', (event) => {
  const inputValue = input.value;
  if (/\d/.test(inputValue)) {
    event.preventDefault();
    alert('Input cannot contain numbers!');
  }
});


//Post Roman Number
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
      location.reload();
    });


    //GetAllElements
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

        

       


//deletes by id
const deleteForm = document.getElementById('deleteForm');
deleteForm.addEventListener('submit', handleDelete);

function handleDelete(event) {
  event.preventDefault();
  const id = document.getElementById('id-delete').value;
  const url = `http://localhost:8080/roman/${id}/delete`;

  fetch(url, { method: 'DELETE' })
    .then(response => {
      if (!response.ok) {
        throw new Error('Failed to delete data');
      }
      return response.json();
    })
    .then(data => {
      const resultContainer = document.getElementById('result-2');
      resultContainer.innerHTML = `Deleted data with ID: ${data.id}`;
    })
    .catch(error => console.error(error));
    location.reload();
}


//updates roman values by id
const form3 = document.getElementById('updateMyForm');
form3.addEventListener('submit', handleSubmit);

function handleSubmit(event) {
  event.preventDefault();
  const id = document.getElementById('id-update').value;
  const roman = document.getElementById('roman-update').value;
  const url = `http://localhost:8080/roman/${id}/update`;

  fetch(url, {
    method: 'PUT',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({ roman })
  })
  .then(response => response.json())
  .then(data => {
    const resultContainer = document.getElementById('result-updated');
    resultContainer.innerHTML = `ID: ${data.id}, Roman: ${data.roman}, Conversion: ${data.conversion}`;
  })
  .catch(error => console.error(error));
  location.reload();
}


 //GetElementById
 const form2 = document.getElementById('myForm2');
 form2.addEventListener('submit', handleSubmit);
 
 function handleSubmit(event) {
   event.preventDefault();
   const id = document.getElementById('id').value;
   const url = `http://localhost:8080/roman/${id}`;
 
   fetch(url)
     .then(response => response.json())
     .then(data => {
       const resultContainer = document.getElementById('result');
       resultContainer.innerHTML = `ID: ${data.id}, Roman: ${data.roman}, Conversion: ${data.conversion}`;
     })
     .catch(error => console.error(error));
 }
 