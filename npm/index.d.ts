declare module '@apiverve/truthtable' {
  export interface truthtableOptions {
    api_key: string;
    secure?: boolean;
  }

  export interface truthtableResponse {
    status: string;
    error: string | null;
    data: TruthTableGeneratorData;
    code?: number;
  }


  interface TruthTableGeneratorData {
      expression:    string;
      normalized:    string;
      variables:     string[];
      variableCount: number;
      rowCount:      number;
      rows:          Row[];
      asciiTable:    string;
  }
  
  interface Row {
      inputs: Inputs;
      result: number;
  }
  
  interface Inputs {
      a: number;
      b: number;
      c: number;
      d: number;
      n: number;
      o: number;
      r: number;
  }

  export default class truthtableWrapper {
    constructor(options: truthtableOptions);

    execute(callback: (error: any, data: truthtableResponse | null) => void): Promise<truthtableResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: truthtableResponse | null) => void): Promise<truthtableResponse>;
    execute(query?: Record<string, any>): Promise<truthtableResponse>;
  }
}
