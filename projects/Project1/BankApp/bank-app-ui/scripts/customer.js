// var cust = "";
// for (let customer of customers) {
//     cust += `<div class="col-sm-4 "> 
//     <div class="card text-white bg-dark mb-3">
//       <div class="card-body">
//         <h3> Name:  ${customer.firstName} ${customer.lastName}</h3>
//         <h5>Email:  ${customer.Email}</h5>
//         <div class="badge badge-warning">Phone Number: ${customer.PhoneNumber}</div><br><br>
//         <div class="card-footer">
         
//           <a href="ecustomerAccounts.html" class="btn btn-primary">AccountList</a>
       
//         </div>
//       </div>
//     </div>
//   </div>`;
// }
// document.getElementById("details").innerHTML = cust;


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
          <a href="Accounts.html" class="btn btn-primary">AccountList</a>
        </div>
      </div>
    </div>
  </div>`;
    }
    document.getElementById("cdetails").innerHTML = cus;


  } catch (err) {

  }
})();