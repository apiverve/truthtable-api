declare module '@apiverve/truthtable' {
  export interface truthtableOptions {
    api_key: string;
    secure?: boolean;
  }

  /**
   * Describes fields the current plan does not unlock. Locked fields arrive as null
   * in `data`; `locked_fields` names them, using dot paths for nested fields.
   * Absent when the plan unlocks everything.
   */
  export interface PremiumInfo {
    message: string;
    upgrade_url: string;
    locked_fields: string[];
  }

  export interface truthtableResponse {
    status: string;
    error: string | null;
    data: TruthTableGeneratorData;
    code?: number;
    premium?: PremiumInfo;
  }


  interface TruthTableGeneratorData {
      expression:    null | string;
      normalized:    null | string;
      variables:     (null | string)[];
      variableCount: number | null;
      rowCount:      number | null;
      rows:          Row[];
      asciiTable:    null | string;
  }
  
  interface Row {
      inputs: Inputs;
      result: number | null;
  }
  
  interface Inputs {
      a: number | null;
      b: number | null;
      c: number | null;
      d: number | null;
      n: number | null;
      o: number | null;
      r: number | null;
  }

  export default class truthtableWrapper {
    constructor(options: truthtableOptions);

    execute(callback: (error: any, data: truthtableResponse | null) => void): Promise<truthtableResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: truthtableResponse | null) => void): Promise<truthtableResponse>;
    execute(query?: Record<string, any>): Promise<truthtableResponse>;
  }
}
