// OFERTA

let btnCreateOffer = document.getElementById("creButton");

btnCreateOffer.addEventListener("click", createOffer);

let createOffer = async () => {
  let date = {};

  date.optionsType = document.getElementById("optionsType").value;
  date.optionsBrand = document.getElementById("optionsBrand").value;
  date.capacity = document.getElementById("capacity").value;
  date.providerName = document.getElementById("provider-name").value;
  date.providerType = document.getElementById("provider-type").value;
  date.providerEmail = document.getElementById("provider-email").value;
  date.providerPhoneNumber = document.getElementById(
    "provider-phone-number"
  ).value;
  date.date = document.getElementById("date").value;
  date.time = document.getElementById("time").value;
  date.origin = document.getElementById("origin").value;
  date.destination = document.getElementById("destination").value;

  const request = await fetch("http://localhost:8080/id)", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      Accept: "application/json",
    },
    body: JSON.stringify(date),
  });
};

// RESERVAS

let btnReserve = document.getElementById("reserve-button");

btnReserve.addEventListener("click", () => {
  Event.preventDefault();
  reserve();
});

let reserve = async () => {
  let reserves = {};

  reserves.usuarioId = document.getElementById("usuarioId").value;
  reserves.ofertaId = document.getElementById("ofertaId").value;
  reserves.fechaReserva = document.getElementById("fechaReserva").value;
  reserves.totalPago = document.getElementById("totalPago").value;

  try {
    const response = await fetch("http://localhost:8080/id", {
      method: "POST",
      headers: {
        Accept: "application/json",
      },
      body: JSON.stringify(reserves),
    });

    if (response.ok) {
      const result = await response.json();
      console.log("Reservation created successfully!", result);
      window.location.href = "OfferCompleted.jsp";
    } else {
      console.error("Error creating reservation");
      alert("Error: Could not create reservation, try again");
    }
  } catch (error) {
    console.error("Request error", error);
  }
};

// VISUALIZAR LAS OFERTAS CREADAS

document.addEventListener("DOMContentLoaded", () => {
  fetchOffers();
});

let fetchOffers = async () => {
  try {
    const response = await fetch("http://localhost:8080/ofertas");
    const offers = await response.json();

    let tbody = document.querySelector(".offers tbody");
    tbody.innerHTML = "";

    offers.forEach((offer) => {
      let row = `<tr>
            <td>${offer.type}</td>
            <td>${offer.brand}</td>
            <td>${offer.capacity}</td>
            <td>${offer.date}</td>
            <td>${offer.hour}</td>
            <td>${offer.origin}</td>
            <td>${offer.departure}</td>
            <td>
                <a class="reserve" href="OfferCompleted.jsp" id="reserve-button" name="reserve-button">Reserve</a>
            </td>
         </tr>`;
      tbody.innerHTML += row;
    });
  } catch (error) {
    console.error("Error getting offers", error);
  }
};
