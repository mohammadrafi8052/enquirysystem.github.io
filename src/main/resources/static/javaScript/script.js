
// Function to search mobile number
function searchMobileNumber() {
  var mobile = document.getElementById('mobileNumber').value;
  if (isValidMobileNumber(mobile)) {
    // When mobile number is valid, show the create popup
    document.getElementById('createPopup').style.display = 'block';
  } else {
    alert('Please enter a valid mobile number');
  }
}

// Function to check if input is a valid mobile number
function isValidMobileNumber(mobile) {
  // You can add your validation logic here, for example:
  // Assume a valid mobile number is 10 digits long
  return /^\d{10}$/.test(mobile);
}

// Function to create an entry
function createEntry() {
  // Implement the logic to create a new entry for the mobile number
  alert('Creating a new entry for the mobile number');
  closePopup();
}

// Function to close the popup
function closePopup() {
  document.getElementById('createPopup').style.display = 'none';
}


