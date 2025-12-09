Truth Table Generator API
============

Truth Table Generator creates complete truth tables for boolean expressions with support for AND, OR, NOT, XOR, NAND, and NOR operators.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a Python API Wrapper for the [Truth Table Generator API](https://apiverve.com/marketplace/api/truthtable)

---

## Installation
	pip install apiverve-truthtablegenerator

---

## Configuration

Before using the truthtable API client, you have to setup your account and obtain your API Key.  
You can get it by signing up at [https://apiverve.com](https://apiverve.com)

---

## Usage

The Truth Table Generator API documentation is found here: [https://docs.apiverve.com/api/truthtable](https://docs.apiverve.com/api/truthtable).  
You can find parameters, example responses, and status codes documented here.

### Setup

```
# Import the client module
from apiverve_truthtablegenerator.apiClient import TruthtableAPIClient

# Initialize the client with your APIVerve API key
api = TruthtableAPIClient("[YOUR_API_KEY]")
```

---


### Perform Request
Using the API client, you can perform requests to the API.

###### Define Query

```
query = { "expression": "A AND B OR C" }
```

###### Simple Request

```
# Make a request to the API
result = api.execute(query)

# Print the result
print(result)
```

###### Example Response

```
{
  "status": "ok",
  "error": null,
  "data": {
    "expression": "A AND B OR C",
    "normalized": "A && B || C",
    "variables": [
      "A",
      "B",
      "C",
      "D",
      "N",
      "O",
      "R"
    ],
    "variableCount": 7,
    "rowCount": 128,
    "rows": [
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 0,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 0
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 0,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 0,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 0,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 0,
          "O": 1,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 0,
          "R": 1
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 0
        },
        "result": 1
      },
      {
        "inputs": {
          "A": 1,
          "B": 1,
          "C": 1,
          "D": 1,
          "N": 1,
          "O": 1,
          "R": 1
        },
        "result": 1
      }
    ],
    "asciiTable": "| A        | B        | C        | D        | N        | O        | R        | Result   |\n|----------|----------|----------|----------|----------|----------|----------|----------|\n| 0        | 0        | 0        | 0        | 0        | 0        | 0        | 0        |\n| 0        | 0        | 0        | 0        | 0        | 0        | 1        | 0        |\n| 0        | 0        | 0        | 0        | 0        | 1        | 0        | 0        |\n| 0        | 0        | 0        | 0        | 0        | 1        | 1        | 0        |\n| 0        | 0        | 0        | 0        | 1        | 0        | 0        | 0        |\n| 0        | 0        | 0        | 0        | 1        | 0        | 1        | 0        |\n| 0        | 0        | 0        | 0        | 1        | 1        | 0        | 0        |\n| 0        | 0        | 0        | 0        | 1        | 1        | 1        | 0        |\n| 0        | 0        | 0        | 1        | 0        | 0        | 0        | 0        |\n| 0        | 0        | 0        | 1        | 0        | 0        | 1        | 0        |\n| 0        | 0        | 0        | 1        | 0        | 1        | 0        | 0        |\n| 0        | 0        | 0        | 1        | 0        | 1        | 1        | 0        |\n| 0        | 0        | 0        | 1        | 1        | 0        | 0        | 0        |\n| 0        | 0        | 0        | 1        | 1        | 0        | 1        | 0        |\n| 0        | 0        | 0        | 1        | 1        | 1        | 0        | 0        |\n| 0        | 0        | 0        | 1        | 1        | 1        | 1        | 0        |\n| 0        | 0        | 1        | 0        | 0        | 0        | 0        | 1        |\n| 0        | 0        | 1        | 0        | 0        | 0        | 1        | 1        |\n| 0        | 0        | 1        | 0        | 0        | 1        | 0        | 1        |\n| 0        | 0        | 1        | 0        | 0        | 1        | 1        | 1        |\n| 0        | 0        | 1        | 0        | 1        | 0        | 0        | 1        |\n| 0        | 0        | 1        | 0        | 1        | 0        | 1        | 1        |\n| 0        | 0        | 1        | 0        | 1        | 1        | 0        | 1        |\n| 0        | 0        | 1        | 0        | 1        | 1        | 1        | 1        |\n| 0        | 0        | 1        | 1        | 0        | 0        | 0        | 1        |\n| 0        | 0        | 1        | 1        | 0        | 0        | 1        | 1        |\n| 0        | 0        | 1        | 1        | 0        | 1        | 0        | 1        |\n| 0        | 0        | 1        | 1        | 0        | 1        | 1        | 1        |\n| 0        | 0        | 1        | 1        | 1        | 0        | 0        | 1        |\n| 0        | 0        | 1        | 1        | 1        | 0        | 1        | 1        |\n| 0        | 0        | 1        | 1        | 1        | 1        | 0        | 1        |\n| 0        | 0        | 1        | 1        | 1        | 1        | 1        | 1        |\n| 0        | 1        | 0        | 0        | 0        | 0        | 0        | 0        |\n| 0        | 1        | 0        | 0        | 0        | 0        | 1        | 0        |\n| 0        | 1        | 0        | 0        | 0        | 1        | 0        | 0        |\n| 0        | 1        | 0        | 0        | 0        | 1        | 1        | 0        |\n| 0        | 1        | 0        | 0        | 1        | 0        | 0        | 0        |\n| 0        | 1        | 0        | 0        | 1        | 0        | 1        | 0        |\n| 0        | 1        | 0        | 0        | 1        | 1        | 0        | 0        |\n| 0        | 1        | 0        | 0        | 1        | 1        | 1        | 0        |\n| 0        | 1        | 0        | 1        | 0        | 0        | 0        | 0        |\n| 0        | 1        | 0        | 1        | 0        | 0        | 1        | 0        |\n| 0        | 1        | 0        | 1        | 0        | 1        | 0        | 0        |\n| 0        | 1        | 0        | 1        | 0        | 1        | 1        | 0        |\n| 0        | 1        | 0        | 1        | 1        | 0        | 0        | 0        |\n| 0        | 1        | 0        | 1        | 1        | 0        | 1        | 0        |\n| 0        | 1        | 0        | 1        | 1        | 1        | 0        | 0        |\n| 0        | 1        | 0        | 1        | 1        | 1        | 1        | 0        |\n| 0        | 1        | 1        | 0        | 0        | 0        | 0        | 1        |\n| 0        | 1        | 1        | 0        | 0        | 0        | 1        | 1        |\n| 0        | 1        | 1        | 0        | 0        | 1        | 0        | 1        |\n| 0        | 1        | 1        | 0        | 0        | 1        | 1        | 1        |\n| 0        | 1        | 1        | 0        | 1        | 0        | 0        | 1        |\n| 0        | 1        | 1        | 0        | 1        | 0        | 1        | 1        |\n| 0        | 1        | 1        | 0        | 1        | 1        | 0        | 1        |\n| 0        | 1        | 1        | 0        | 1        | 1        | 1        | 1        |\n| 0        | 1        | 1        | 1        | 0        | 0        | 0        | 1        |\n| 0        | 1        | 1        | 1        | 0        | 0        | 1        | 1        |\n| 0        | 1        | 1        | 1        | 0        | 1        | 0        | 1        |\n| 0        | 1        | 1        | 1        | 0        | 1        | 1        | 1        |\n| 0        | 1        | 1        | 1        | 1        | 0        | 0        | 1        |\n| 0        | 1        | 1        | 1        | 1        | 0        | 1        | 1        |\n| 0        | 1        | 1        | 1        | 1        | 1        | 0        | 1        |\n| 0        | 1        | 1        | 1        | 1        | 1        | 1        | 1        |\n| 1        | 0        | 0        | 0        | 0        | 0        | 0        | 0        |\n| 1        | 0        | 0        | 0        | 0        | 0        | 1        | 0        |\n| 1        | 0        | 0        | 0        | 0        | 1        | 0        | 0        |\n| 1        | 0        | 0        | 0        | 0        | 1        | 1        | 0        |\n| 1        | 0        | 0        | 0        | 1        | 0        | 0        | 0        |\n| 1        | 0        | 0        | 0        | 1        | 0        | 1        | 0        |\n| 1        | 0        | 0        | 0        | 1        | 1        | 0        | 0        |\n| 1        | 0        | 0        | 0        | 1        | 1        | 1        | 0        |\n| 1        | 0        | 0        | 1        | 0        | 0        | 0        | 0        |\n| 1        | 0        | 0        | 1        | 0        | 0        | 1        | 0        |\n| 1        | 0        | 0        | 1        | 0        | 1        | 0        | 0        |\n| 1        | 0        | 0        | 1        | 0        | 1        | 1        | 0        |\n| 1        | 0        | 0        | 1        | 1        | 0        | 0        | 0        |\n| 1        | 0        | 0        | 1        | 1        | 0        | 1        | 0        |\n| 1        | 0        | 0        | 1        | 1        | 1        | 0        | 0        |\n| 1        | 0        | 0        | 1        | 1        | 1        | 1        | 0        |\n| 1        | 0        | 1        | 0        | 0        | 0        | 0        | 1        |\n| 1        | 0        | 1        | 0        | 0        | 0        | 1        | 1        |\n| 1        | 0        | 1        | 0        | 0        | 1        | 0        | 1        |\n| 1        | 0        | 1        | 0        | 0        | 1        | 1        | 1        |\n| 1        | 0        | 1        | 0        | 1        | 0        | 0        | 1        |\n| 1        | 0        | 1        | 0        | 1        | 0        | 1        | 1        |\n| 1        | 0        | 1        | 0        | 1        | 1        | 0        | 1        |\n| 1        | 0        | 1        | 0        | 1        | 1        | 1        | 1        |\n| 1        | 0        | 1        | 1        | 0        | 0        | 0        | 1        |\n| 1        | 0        | 1        | 1        | 0        | 0        | 1        | 1        |\n| 1        | 0        | 1        | 1        | 0        | 1        | 0        | 1        |\n| 1        | 0        | 1        | 1        | 0        | 1        | 1        | 1        |\n| 1        | 0        | 1        | 1        | 1        | 0        | 0        | 1        |\n| 1        | 0        | 1        | 1        | 1        | 0        | 1        | 1        |\n| 1        | 0        | 1        | 1        | 1        | 1        | 0        | 1        |\n| 1        | 0        | 1        | 1        | 1        | 1        | 1        | 1        |\n| 1        | 1        | 0        | 0        | 0        | 0        | 0        | 1        |\n| 1        | 1        | 0        | 0        | 0        | 0        | 1        | 1        |\n| 1        | 1        | 0        | 0        | 0        | 1        | 0        | 1        |\n| 1        | 1        | 0        | 0        | 0        | 1        | 1        | 1        |\n| 1        | 1        | 0        | 0        | 1        | 0        | 0        | 1        |\n| 1        | 1        | 0        | 0        | 1        | 0        | 1        | 1        |\n| 1        | 1        | 0        | 0        | 1        | 1        | 0        | 1        |\n| 1        | 1        | 0        | 0        | 1        | 1        | 1        | 1        |\n| 1        | 1        | 0        | 1        | 0        | 0        | 0        | 1        |\n| 1        | 1        | 0        | 1        | 0        | 0        | 1        | 1        |\n| 1        | 1        | 0        | 1        | 0        | 1        | 0        | 1        |\n| 1        | 1        | 0        | 1        | 0        | 1        | 1        | 1        |\n| 1        | 1        | 0        | 1        | 1        | 0        | 0        | 1        |\n| 1        | 1        | 0        | 1        | 1        | 0        | 1        | 1        |\n| 1        | 1        | 0        | 1        | 1        | 1        | 0        | 1        |\n| 1        | 1        | 0        | 1        | 1        | 1        | 1        | 1        |\n| 1        | 1        | 1        | 0        | 0        | 0        | 0        | 1        |\n| 1        | 1        | 1        | 0        | 0        | 0        | 1        | 1        |\n| 1        | 1        | 1        | 0        | 0        | 1        | 0        | 1        |\n| 1        | 1        | 1        | 0        | 0        | 1        | 1        | 1        |\n| 1        | 1        | 1        | 0        | 1        | 0        | 0        | 1        |\n| 1        | 1        | 1        | 0        | 1        | 0        | 1        | 1        |\n| 1        | 1        | 1        | 0        | 1        | 1        | 0        | 1        |\n| 1        | 1        | 1        | 0        | 1        | 1        | 1        | 1        |\n| 1        | 1        | 1        | 1        | 0        | 0        | 0        | 1        |\n| 1        | 1        | 1        | 1        | 0        | 0        | 1        | 1        |\n| 1        | 1        | 1        | 1        | 0        | 1        | 0        | 1        |\n| 1        | 1        | 1        | 1        | 0        | 1        | 1        | 1        |\n| 1        | 1        | 1        | 1        | 1        | 0        | 0        | 1        |\n| 1        | 1        | 1        | 1        | 1        | 0        | 1        | 1        |\n| 1        | 1        | 1        | 1        | 1        | 1        | 0        | 1        |\n| 1        | 1        | 1        | 1        | 1        | 1        | 1        | 1        |\n"
  }
}
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact).

---

## Updates
Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms) and all legal documents and agreements.

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2025 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.