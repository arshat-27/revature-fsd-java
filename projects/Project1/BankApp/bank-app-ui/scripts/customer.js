(async function () {
  try {
    let response = await fetch("http://localhost:8080/bank-app-rest/employees");
    let customers = await response.json();
    var cus = "";
    for (let customer of customers) {
      console.log(customer);
         cus +=` <div class="col-sm-6">
    <div class="card card text-white bg-dark mb-3">
      <div class="card-body ">
        <h5>Customer Name : ${customer.firstName+customer.lastName}</h5>
        <h5>Email : ${customer.email}</h5>
        <h5>Phone-Number : ${customer.phoneno}</h5>
        <div class="card-footer">
          <a href="acustomer.html?id=${customer.id}" class="btn btn-primary">AccountList</a>
        </div>
      </div>
    </div>
  </div>`;
    }
    document.getElementById("cdetails").innerHTML = cus;


  } catch (err) {

  }
})();