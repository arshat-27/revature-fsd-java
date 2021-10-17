
// var acc = "";
// for (let account of accounts) {
//     acc += ` <div class="col-sm-6">
//     <div class="card card text-white bg-dark mb-3">
//       <div class="card-body ">
//         <h5>Account Number : ${account.AccountNumber}</h5>
       
//         <div class="badge badge-danger">Balance : ${account.balance}</div><br><br>
//         <div class="card-footer">
//           <a href="WithDraw.html" class="btn btn-primary">WithDraw</a>
//           <a href="Deposit.html" class="btn btn-primary">Deposit</a>
//           <a href="TransactionList.html" class="btn btn-primary">TransactionList</a>
//         </div>
//       </div>
//     </div>
//   </div>`;
// }
// document.getElementById("account").innerHTML = acc;

(async function () {
  try {
    let response = await fetch("http://localhost:8080/bank-app-rest/accounts");
    let accounts = await response.json();
    var acc = "";
    for (let account of accounts) {
      console.log(account);
         acc += ` <div class="col-sm-6">
    <div class="card card text-white bg-dark mb-3">
      <div class="card-body ">
        <h5>Account Number : ${account.accountNumber}</h5>
       
        <div class="badge badge-danger">Balance : ${account.balance}</div><br><br>
        <div class="card-footer">
          <a href="WithDraw.html" class="btn btn-primary">WithDraw</a>
          <a href="Deposit.html" class="btn btn-primary">Deposit</a>
          <a href="TransactionList.html" class="btn btn-primary">TransactionList</a>
        </div>
      </div>
    </div>
  </div>`;
    }
    document.getElementById("account").innerHTML = acc;


  } catch (err) {

  }
})();