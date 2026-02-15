using System;
using System.Collections.Generic;
using System.Text;
using Newtonsoft.Json;

namespace APIVerve.API.TruthTableGenerator
{
    /// <summary>
    /// Query options for the Truth Table Generator API
    /// </summary>
    public class TruthTableGeneratorQueryOptions
    {
        /// <summary>
        /// Boolean expression using A-Z variables and operators (AND, OR, NOT, XOR, NAND, NOR)
        /// </summary>
        [JsonProperty("expression")]
        public string Expression { get; set; }
    }
}
