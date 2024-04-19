import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: 'e1d70d35-a25d-4788-816a-951dca2bb2ca',
};

export const sampleWithPartialData: IAuthority = {
  name: 'c2131d1c-9e28-4076-b829-df7004b214f0',
};

export const sampleWithFullData: IAuthority = {
  name: '474a353a-b0c4-4ce3-b376-b7db960c2b71',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
