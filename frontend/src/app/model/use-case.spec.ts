import { UseCase } from './use-case';

describe('UseCase Model Class', () => {

    function setUp() {
        const uut: UseCase = new UseCase();
        return { uut };
    }

    it('should return null initally for name', () => {
        const { uut } = setUp();
        expect(uut.name).toBeNull();
    })
});