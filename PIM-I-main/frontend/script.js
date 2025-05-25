const API_URL = 'http://localhost:8080/api/consumos';

document.getElementById('houseForm').addEventListener('submit', async (e) => {
    e.preventDefault();
    const consumo = {
        streetName: document.getElementById('streetName').value,
        houseNumber: document.getElementById('houseNumber').value,
        dailyWaterUsage: parseFloat(document.getElementById('dailyWaterUsage').value)
    };
    try {
        const response = await fetch(API_URL, {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(consumo)
        });
        if (response.ok) {
            alert('Consumo cadastrado com sucesso!');
            document.getElementById('houseForm').reset();
        } else {
            alert('Erro ao cadastrar. Tente novamente.');
        }
    } catch (error) {
        console.error('Erro:', error);
        alert('Erro na comunicação com o servidor.');
    }
});

